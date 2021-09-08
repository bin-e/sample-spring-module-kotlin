# sample-spring-module-kotlin

## knowledge
- sub-module을 새로 만들 때, Spring initializer를 사용하기보단, `new -> module -> gradle`로 작성해서 필요파일 추가하는게 더 빠름
- subproject `gradle` 설정시, `Error resolving plugin` 에러가 뜰 수 있음. 이럴땐 버전 정보를 삭제하면 정상적으로 동작.
- `core`, `domain` 같은 도메인명은 사용자에따라 케바케 같은데, 이건 약속을 정할 필요가 있어보임
  - `service`, `domain`이 더 직관적이긴 한데 폴더 순서가 별로임
- Kotlin DSL로 생성한 gradle 파일의 경우 아직 이해가 부족해서 이건 더 공부하거나, 당장 `build.gradle`을 사용할 수 있음.