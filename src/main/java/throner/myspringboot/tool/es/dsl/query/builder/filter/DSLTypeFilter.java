/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/
package throner.myspringboot.tool.es.dsl.query.builder.filter;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

/**
 * Represents a Type query
 * 
 * See http://www.elasticsearch.org/guide/en/elasticsearch/reference/current/query-dsl-type-filter.html
 */
public class DSLTypeFilter implements DSLFilter {
    
    private static final String TYPE = "type";
    private static final String VALUE = "value";
    
    private String value;

    public DSLTypeFilter(String value) {
        this.value = value;
    }
    
    public JsonObject getFilterAsJson() {
        JsonObject result = new JsonObject();
        JsonObject typeObject = new JsonObject();
        result.add(TYPE, typeObject);
        typeObject.add(VALUE, new JsonPrimitive(value));
        return result;
    }
}
