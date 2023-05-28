import { ApolloServer } from '@apollo/server';
import { startStandaloneServer } from '@apollo/server/standalone';

const typeDefs = `#graphql
  type Query {
    post(id: ID!): Post
    posts: [Post]
  }

  input CreatePostInput {
      title: String!
      content: String!
      writerId: ID!
  }

  input UpdatePostInput {
      content: String!
  }

  type Mutation {
      createPost(data: CreatePostInput!): Post
      updatePost(id: ID!, data: UpdatePostInput!): Post
  }

  type User {
      id: ID!
      firstName: String
      lastName: String
  }

  type Post {
      id: ID!
      title: String!
      content: String
      writer: User
  }
`;

const posts = [
  {
    id: 'post-1',
    title: 'Good Post',
    content: 'It is a good post',
    writerId: 'user-1',
  },
  {
    id: 'post-2',
    title: 'Bad Post',
    content: 'It is a bad post',
    writerId: 'user-2',
  },
  {
    id: 'post-3',
    title: 'Nice Post',
    content: 'It is a nice post',
    writerId: 'user-3',
  }
];

const users = [
  {
    id: 'user-1',
    firstName: 'Joshua',
    lastName: 'Bloch',
  },
  {
    id: 'user-2',
    firstName: 'Douglas',
    lastName: 'Adams',
  },
  {
    id: 'user-3',
    firstName: 'Bill',
    lastName: 'Bryson',
  }
];

const resolvers = {
  Query: {
    post: (_, args) => posts.find((post) => post.id === args.id),
    posts: () => posts
  },
  Mutation: {
    createPost: (_, args) => {
      const post = {
        id: `post-${posts.length + 1}`,
        title: args.data.title,
        content: args.data.content,
        writerId: args.data.writerId
      };
      posts.push(post);
      return post;
    },
    updatePost: (_, args) => {
      const post = posts.find((post) => post.id === args.id);
      if (!post) {
        throw new Error(`Couldn't find post with id ${args.id}`);
      }
      post.content = args.data.content;
      return post;
    },
  },
  Post: {
    writer: (post) => users.find((user) => user.id === post.writerId)
  }
};

const server = new ApolloServer({
  typeDefs,
  resolvers,
});

const { url } = await startStandaloneServer(server, {
  listen: { port: 4000 },
});

console.log(`🚀  Server ready at: ${url}`);