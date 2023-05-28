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

---

## Chapter2 실습 문제
### 문제
* 강의자료 예제인 `createPost mutation` 를 보고, 응용해서 `updatePost mutation`를 작성해 봅니다.
* `updatePost mutation`는 수정된 Post를 반환합니다.
* `post`는 `content`필드만 수정 가능한 것으로 기능을 정의하겠습니다.
* `updatePost`는 `ID`를 사용해서 `content`를 수정합니다. 이 필드는 둘다 Non-null이어야 합니다.

### 출제 의도
* SDL을 직접 작성해 봅니다.

---

## Chapter3 실습 문제
### 문제
* 강의 자료와 코드베이스의 `posts query`를 참고해서, `post query`를 직접 구현해 봅니다.
* `post query`는 `Post` schema를 반환합니다.
* `Post.java`에 `public static Post getById(String id)` 메서드를 구현하고, 이를 Controller의 `post`메서드에서 호출합니다.


### 출제 의도
* Controller에서 직접 Schema를 구현해봅니다.
