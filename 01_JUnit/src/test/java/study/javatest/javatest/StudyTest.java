package study.javatest.javatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {
    /**
     * IntelliJ에서 DisplayName이 안먹히는 경우,
     * 별도의 설정을 해주어야한다.
     * 블로그에 정리해서 올릴 예정.
     */

    @Test
    @DisplayName("스터디 만들기")
    void create_new_study() {
        Study study = new Study();
        assertNotNull(study);
    }

    @Test
    @DisplayName("스터디 다시 만들기")
    void create_new_study_again() {
        System.out.println("create1");
    }

    /**
     * static 메소드 사용해야함.
     * return 타입 없어야함.
     * 모든 테스트가 실행되기 이전에 한번만 실행
     */
    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    /**
     * static 메소드 사용해야함.
     * return 타입 없어야함.
     * 모든 테스트가 실행된 후에 한번만 실행
     */
    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    // 모든 테스트마다 실행 이전에 한번 호출
    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    // 모든 테스트마다 실행 이후에 한번 호출
    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}