package throner.myspringboot.es.org.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import throner.myspringboot.es.org.document.Test;

/**
 * Created by chenjiansheng on 2020-7-9.
 */
public interface TestESRepository extends ElasticsearchRepository<Test, Integer> {
}
