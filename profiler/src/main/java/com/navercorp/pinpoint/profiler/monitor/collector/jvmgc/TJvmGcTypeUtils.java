/*
 * Copyright 2018 NAVER Corp.
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
 */

package com.navercorp.pinpoint.profiler.monitor.collector.jvmgc;

import com.navercorp.pinpoint.thrift.dto.TJvmGcType;

/**
 * @author Woonduk Kang(emeroad)
 */
public final class TJvmGcTypeUtils {
    private TJvmGcTypeUtils() {
    }

    public static TJvmGcType toTJvmGcType(int value) {
        switch (value) {
            case 0:
                return TJvmGcType.UNKNOWN;
            case 1:
                return TJvmGcType.SERIAL;
            case 2:
                return TJvmGcType.PARALLEL;
            case 3:
                return TJvmGcType.CMS;
            case 4:
                return TJvmGcType.G1;
            default:
                return null;
        }
    }
}