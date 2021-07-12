/*
 * Copyright (C) 2017, Megatron King
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.github.megatronking.stringfog.plugin;

/**
 * StringFog extension.
 * <p>
 * <code>
 * stringfog {*     key 'Hello World'
 *     enable true
 *}* </code>
 *
 * @author Megatron King
 * @since 2017/3/7 17:44
 */

public class StringFogExtension {

    int keyLength = 2
    boolean enable = true
    boolean debug = false
    String[] fogPackages = []
    String implementation

}
