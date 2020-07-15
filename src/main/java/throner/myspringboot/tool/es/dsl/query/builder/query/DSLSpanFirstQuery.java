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
package throner.myspringboot.tool.es.dsl.query.builder.query;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

/**
 * Represents a Span First query
 */
public class DSLSpanFirstQuery implements DSLSpanQuery {

    private static final String SPAN_FIRST = "span_first";
    private static final String MATCH = "match";
    private static final String END = "end";

    private DSLSpanQuery spanQuery;
    private Integer end;

    public DSLSpanFirstQuery(DSLSpanQuery spanQuery, Integer end) {
        this.spanQuery = spanQuery;
        this.end = end;
    }

    public JsonObject getQueryAsJson() {
        JsonObject result = new JsonObject();
        JsonObject spanFirstObject = new JsonObject();
        result.add(SPAN_FIRST, spanFirstObject);
        spanFirstObject.add(MATCH, spanQuery.getQueryAsJson());
        spanFirstObject.add(END, new JsonPrimitive(end));
        return result;
    }
}
