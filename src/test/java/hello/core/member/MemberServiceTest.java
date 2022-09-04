package hello.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // then
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // when
        Assertions.assertEquals(1L, findMember.getId());
    }
}
