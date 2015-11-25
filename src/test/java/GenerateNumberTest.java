import org.junit.Before;
import org.junit.Test;



import java.util.HashSet;
import java.util.Set;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class GenerateNumberTest {

    private GenerateNumber generator;

    @Before
    public void setup() throws Exception {
        generator = new GenerateNumber();
    }

    @Test
    public void should_be_4_bit() throws Exception {
        String number = generator.generateNum();
        assertThat(number.length(), is(4));
    }
    @Test
    public void should_be_digit() throws Exception {
        String number = generator.generateNum();
        for (int i = 0; i < number.length(); i++) {
            assert ("123456789".contains(number.substring(i, i + 1)));
        }
    }
    @Test
    public  void should_each_bit_be_different() throws Exception{
        String number = generator.generateNum();
        char[] num_char = number.toCharArray();
        Set<Character> num_set = new HashSet<Character>();
        for(char x:num_char){
            num_set.add(x);
        }
        assertThat(num_char.length,is(num_set.size()));
    }
    @Test
    public void should_be_random() throws Exception{
        HashSet<String> num_set = new HashSet<String>();
        for(int i=0;i<5;i++){
            String num = generator.generateNum();
            num_set.add(num);
        }
        assertThat(num_set.size(),is(5));
    }
}

