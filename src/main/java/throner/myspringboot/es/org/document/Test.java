package throner.myspringboot.es.org.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * Created by chenjiansheng on 2020-7-6.
 */
@Document(indexName = "test1",type="book")
@Data
public class Test implements Serializable  {

    @Id
    private Integer id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Long)
    private long price;

}
