/*
 *
 * Copyright (c) 2020  Stefan Spiska (Vitasystems GmbH) and Hannover Medical School
 * This file is part of Project EHRbase
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.ehrbase.aqleditor.dto.aql;

import lombok.Data;
import org.ehrbase.aqleditor.dto.aql.condition.ConditionDto;
import org.ehrbase.aqleditor.dto.aql.containment.ContainmentExpresionDto;
import org.ehrbase.aqleditor.dto.aql.orderby.OrderByExpressionDto;
import org.ehrbase.aqleditor.dto.aql.select.SelectDto;

import java.util.List;

@Data
public class AqlDto {

  private SelectDto select;
  private EhrDto ehr;
  private ContainmentExpresionDto contains;
  private ConditionDto where;
  private List<OrderByExpressionDto> orderBy;
}
