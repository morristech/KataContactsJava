/*
 * Copyright (C) 2015 Karumi.
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

package com.karumi.katagenda.ui;

import com.karumi.katagenda.domain.Contact;
import java.util.List;

public class SysOutContactsListView implements ContactsListPresenter.View {

  @Override public void showWelcomeMessage() {

  }

  @Override public void showGoodbyeMessage() {

  }

  @Override public void showContacts(List<Contact> contactList) {

  }

  @Override public String getNewContactFirstName() {
    return null;
  }

  @Override public String getNewContactLastName() {
    return null;
  }

  @Override public String getNewContactPhoneNumber() {
    return null;
  }

  @Override public void showDefaultError() {

  }
}