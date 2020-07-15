package throner.myspringboot.es.org.document;

import io.searchbox.annotations.JestId;
import lombok.Data;

/**
 * Created by chenjiansheng on 2020-7-15.
 */
@Data
public class Test1 {
    @JestId
    private Integer id;

    private String name;

    private long price;
}
