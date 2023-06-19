## GraphQL 쿼리 직접 작성해보기
* GraphQL의 기본적인 쿼리 문법과 구조를 직접 작성해서 익혀봅니다.
* GraphQL에서 Overfetching Issue를 어떻게 해결하는지 체감해봅니다.

## posts query를 작성해 보세요.
- 강의자료에 포함된 예제인 `post(id: 1) query`를 참고하세요.
- `posts query`는 모든 post의 목록을 반환 합니다. 따라서, 인자값을 받지 않습니다.
- 모든 object의 `ID`는 항상 쿼리합니다.
- `post` 목록 화면에서는, `post`의 `title`필드와 `writer`필드만 필요하고, `writer`는 ID만 필요합니다.

## 답안
```
query posts {
  id
  title
  writer {
    id
  }
}
```