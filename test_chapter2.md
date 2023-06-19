## SDL 직접 선언하기
* GraphQL서버에 구현할 Schema를 SDL문법을 사용해서 직접 작성해 봅니다. 

## updatePost mutation을 SDL문법을 사용해서 선언해보세요.
* 강의자료 예제인 `createPost mutation` 를 참고하세요.
- `updatePost mutation`는 수정된 `Post`를 반환합니다.
- 반환할 `Post`는 nullable한 것으로 정의합니다.
- `updatePost`는 `id`와 `content`를 인자값으로 받습니다. 이 필드는 둘다 Non-null이어야 합니다.
- 인자값 `id`는 `ID`타입이고, `content`는 String타입입니다.

## 답안
```
updatePost(id: ID!, content: String!): Post
```