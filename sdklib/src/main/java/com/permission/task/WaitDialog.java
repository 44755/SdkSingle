/*
 * Copyright 2019 Zhenjie Yan
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
package com.permission.task;

import android.app.Dialog;
import android.content.Context;

import com.qt.ld.R;


/**
 * Created by Zhenjie Yan on 2019-09-23.
 */
public class WaitDialog extends Dialog {

    public WaitDialog( Context context) {
        super(context, R.style.Permission_Theme_Dialog_Wait);
        setContentView(R.layout.permission_dialog_wait);
    }
}