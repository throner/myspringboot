package throner.myspringboot;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})//这个加进去就会导致有mybatis的无法启动
//@SpringBootApplication
@MapperScan({"throner.myspringboot.**.mapper","com.baomidou.mybatisplus.samples.quickstart.mapper"})
@Slf4j
public class MyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }

}
