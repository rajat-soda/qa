/*
  Copyright 2020 The SODA Authors.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package com.io.sodafoundation.jsonmodels.akskresponses;

public class Blob {


    private String access;

    private String secret;


    public String getAccess() {
        return access;
    }


    public void setAccess(String access) {
        this.access = access;
    }


    public String getSecret() {
        return secret;
    }


    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "Blob{" +
                "access='" + access + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
