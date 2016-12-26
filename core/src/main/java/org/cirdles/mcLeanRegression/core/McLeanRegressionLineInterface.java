/*
 * Copyright 2006-2016 CIRDLES.org.
 *
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
 */
package org.cirdles.mcLeanRegression.core;

/**
 *
 * @author CIRDLES.org
 */
public interface McLeanRegressionLineInterface {

    /**
     * @return the a
     */
    public double[][] getA();

    /**
     * @return the v
     */
    public double[][] getV();

    /**
     * @return the Sav
     */
    public double[][] getSav();

    /**
     * @return the MSWD
     */
    public double getMSWD();

    /**
     * @return the n
     */
    public int getN();
}