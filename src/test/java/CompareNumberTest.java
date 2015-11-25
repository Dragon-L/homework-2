import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CompareNumberTest {
    private CompareNumber comparer;

    @Before
    public void setUp() throws Exception{
        comparer = new CompareNumber();
    }
    @Test
    public void should_get_0A0B_when_compare_1234_and_5678() throws Exception{
        String a = "1234",b = "5678";
        String result = comparer.compareNum(a,b);
        assertThat(result,is("0A0B"));
    }
    @Test
    public void should_get_2A0B_when_compare_1234_and_1256() throws Exception{
        String a = "1234",b = "1256";
        String result = comparer.compareNum(a,b);
        assertThat(result,is("2A0B"));
    }
    @Test
    public void should_get_4A0B_when_compare_1234_and_1234() throws Exception{
        String a = "1234",b = "1234";
        String result = comparer.compareNum(a,b);
        assertThat(result,is("4A0B"));
    }
    @Test
    public void should_get_0A2B_when_compare_1234_and_5612() throws Exception{
        String a = "1234",b = "5612";
        String result = comparer.compareNum(a,b);
        assertThat(result,is("0A2B"));
    }
    @Test
    public void should_get_0A4B_when_compare_1234_and_4321() throws Exception{
        String a = "1234",b = "4321";
        String result = comparer.compareNum(a,b);
        assertThat(result,is("0A4B"));
    }
    @Test
    public void should_get_2A2B_when_compare_1234_and_1243() throws Exception{
        String a = "1234",b = "1243";
        String result = comparer.compareNum(a,b);
        assertThat(result,is("2A2B"));
    }
}
