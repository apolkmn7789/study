//package me.jangseunghun.springbootdeveloper;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//@SpringBootTest // 테스트용 애플리케이션 컨텍스트 사용
//@AutoConfigureMockMvc // MockMvc 생성 및 자동 구성
//class TestControllerTest {
//    @Autowired
//    protected MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @Autowired
//    private MemberRepository memberRepository;
//
//    @BeforeEach // 테스트 실행전 실행하는 메서드
//    public void mockMvcSetUp(){
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
//                .build();
//    }
//    @AfterEach // 테스트 실행후 실행하는 메서드
//    public void cleanUp(){
//        memberRepository.deleteAll();
//    }
//    @DisplayName("getAllMembers: 아티클 조회에 성공한다.")
//    @Test
//    public void getAllMembers() throws Exception {
//        // given
//        final String url = "/test";
//        Member savedMember = memberRepository.save(new Member(1L,"홍길동"));
//
//        // when
//        final ResultActions result = mockMvc.perform(get(url))
//                .accept(MediaType.APPLICATION_JSON);
//
//        // then
//        result
//                .andExpect(status().isOk())
//    }
//}