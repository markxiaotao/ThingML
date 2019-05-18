/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.compilers.java;

import org.thingml.compilers.Context;
import org.thingml.xtext.thingML.Configuration;

/**
 * Created by bmori on 17.12.2014.
 */
public class GraalCfgBuildCompiler extends JavaCfgBuildCompiler {    

    @Override
    public void generateBuildScript(Configuration cfg, Context ctx) {
        try {
            doGenerate(cfg, ctx, "pomtemplates/graalpom.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
