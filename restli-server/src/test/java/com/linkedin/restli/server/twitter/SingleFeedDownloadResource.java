/*
 * Copyright (c) 2017 LinkedIn Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linkedin.restli.server.twitter;


import com.linkedin.restli.server.UnstructuredDataWriter;
import com.linkedin.restli.server.annotations.RestLiSimpleResource;
import com.linkedin.restli.server.annotations.UnstructuredDataWriterParam;
import com.linkedin.restli.server.resources.unstructuredData.UnstructuredDataSimpleResourceTemplate;

import java.io.IOException;


/**
 * Resource that serve a single feed download.
 */
@RestLiSimpleResource(name="singleFeedDownload")
public class SingleFeedDownloadResource extends UnstructuredDataSimpleResourceTemplate
{
  @Override
  public void get(@UnstructuredDataWriterParam UnstructuredDataWriter writer)
  {
    try
    {
      writer.setContentType("text/plain");
      writer.getOutputStream().write("hello".getBytes());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
