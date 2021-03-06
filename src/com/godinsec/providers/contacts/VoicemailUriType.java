/*
 * Copyright (C) 2011 The Android Open Source Project
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
 * limitations under the License
 */
package com.godinsec.providers.contacts;

import com.godinsec.providers.contacts.util.UriType;

/**
 * Defines the different URIs handled by the voicemail content provider.
 */
enum VoicemailUriType implements UriType {
    NO_MATCH(null),
    VOICEMAILS("voicemail"),
    VOICEMAILS_ID("voicemail/#"),
    STATUS("status"),
    STATUS_ID("status/#");

    private final String path;

    private VoicemailUriType(String path) {
        this.path = path;
    }

    @Override
    public String path() {
        return path;
    }
}
