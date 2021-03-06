/*
 *
 *  * Copyright © 2018 Rohit Sahebrao Surwase.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.next.uceh_example;

import android.app.Application;

import com.next.uceh.UCEHandler;

/**
 * <b></b>
 * <p>This class is used to </p>
 * Created by Rohit.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Initialize UCE Handler library
        new UCEHandler.Builder(getApplicationContext())
                .setTrackActivitiesEnabled(true)
                // 手动处理崩溃信息
//                .setUCEHCallback(new UCECallback() {
//                    @Override
//                    public void exceptionInfo(@Nullable ExceptionInfoBean exceptionInfoBean) {
//                        Log.e("UCE-Handler", "exceptionInfo...");
//                    }
//
//                    @Override
//                    public void throwable(@Nullable Throwable throwable) {
//                        Log.e("UCE-Handler", "throwable...");
//                    }
//                })
                .build();
    }
}
