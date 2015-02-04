/**********
    Android ネットラジオ受信のための基本機能サンプルプログラム
     => プリファレンス（機能設定）・メニュー
   
    (C) 2015 INOUE Hirokazu
   
    Version 1.0 (2015/02/03)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *********/

package com.example.android_netradio_02;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingMenu extends PreferenceActivity {
    @SuppressWarnings("deprecation")
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings_menu);

        // 設定内容は、自動的に /data/data/アプリ名/shared_prefs/アプリ名_preferences.xml
        //   に保存され、画面に反映される


    }
}
