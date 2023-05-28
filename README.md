## Chapter1 실습 문제
### 문제
* 강의자료 예제인 `post(id: 1) query` 를 보고, 응용해서 `posts query`를 작성해 봅니다.
* `post query`는 아직 구현되어 있지 않습니다.
* `posts query`는 모든 post의 목록을 반환 합니다.
* `post`, `user` object 모두 `ID`는 항상 쿼리합니다.
* `post` 목록 화면에서는, `post`의 `title`필드와 `writer`필드만 필요하고, `writer`는 ID만 필요합니다.
### 출제 의도
* GraphQL의 기본적인 쿼리 문법과 구조를 직접 작성해서 익혀봅니다.
* GraphQL에서 Overfetching Issue를 어떻게 해결하는지 체감해봅니다.