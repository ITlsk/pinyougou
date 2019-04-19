import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.pinyougou")
@SpringBootApplication
//@MapperScan("com.pinyougou")
public class PinyougouSellergoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinyougouSellergoodsServiceApplication.class, args);
    }

}
