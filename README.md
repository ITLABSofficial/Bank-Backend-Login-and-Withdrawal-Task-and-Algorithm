
### **Algoritma Adımları:**

---

### **1. Kullanıcı Girişi (Login) / User Login / Inicio de sesión del usuario**


#### Türkçe:
- Kullanıcı, **kullanıcı adı** ve **şifresi** ile giriş yapmak ister.
- Sistem, girilen kullanıcı adı ve şifreyi doğrular.

- Şifre doğruysa kullanıcı sisteme giriş yapar, yanlışsa hata mesajı gösterilir.

#### English:

- The user wants to log in with their **username** and **password**.
- The system verifies the entered username and password.
- If the password is correct, the user logs in, otherwise an error message is shown.

#### Español:
- El usuario quiere iniciar sesión con su **nombre de usuario** y **contraseña**.
- El sistema verifica el **nombre de usuario** y la **contraseña** ingresados.
- Si la contraseña es correcta, el usuario inicia sesión, si es incorrecta, se muestra un mensaje de error.

---

### **2. Kayıt İşlemi (Register) / Registration Process / Proceso de registro**

#### Türkçe:
- Yeni bir kullanıcı, sisteme **kullanıcı adı** ve **şifre** belirleyerek kayıt olabilir.
- Kullanıcı adı ve şifre, sistemde saklanmak üzere güvenli bir şekilde hash'lenir (şifrelenir).

- Kayıt işlemi başarılıysa, kullanıcı sisteme kaydedilir.



#### English:
- A new user can register to the system by setting a **username** and **password**.
- The username and password are securely hashed (encrypted) before being stored in the system.
- If registration is successful, the user is added to the system.

#### Español:
- Un nuevo usuario puede registrarse en el sistema estableciendo un **nombre de usuario** y **contraseña**.
- El **nombre de usuario** y la **contraseña** se cifran de manera segura antes de ser almacenados en el sistema.
- Si el registro es exitoso, el usuario se agrega al sistema.

---

### **3. Kullanıcı Menüsü (User Menu) / User Menu / Menú del usuario**

#### Türkçe:
- Kullanıcı başarılı bir şekilde giriş yaptıktan sonra **kullanıcı menüsü** gösterilir.
- Menüde şu seçenekler bulunur:
  - **Bakiye Görüntüle**: Kullanıcının hesabındaki mevcut bakiyeyi gösterir.
  - **Şifre Değiştir**: Kullanıcı, eski şifresini girerek yeni bir şifre belirler.
  - **Para Yatırma**: Kullanıcı, hesabına belirli bir miktar para yatırabilir.
  - **Para Çekme**: Kullanıcı, hesabından belirli bir miktar para çekebilir

  - **Çıkış**: Kullanıcı oturumunu kapatır ve menüden çıkar.

#### English:
- After a successful login, the **user menu** is shown.
- The menu includes the following options:
  - **Check Balance**: Displays the user's current account balance.
  - **Change Password**: The user can enter the old password and set a new one.
  - **Deposit Money**: The user can deposit a specific amount into their account.
  - **Withdraw Money**: The user can withdraw a specific amount from their account.
  - **Logout**: The user logs out and exits the menu.

#### Español:
- Después de iniciar sesión correctamente, se muestra el **menú de usuario**.
- El menú contiene las siguientes opciones:
  - **Ver balance**: Muestra el saldo actual de la cuenta del usuario.
  - **Cambiar contraseña**: El usuario puede ingresar la contraseña antigua y establecer una nueva.
  - **Depositar dinero**: El usuario puede depositar una cantidad específica en su cuenta.
  - **Retirar dinero**: El usuario puede retirar una cantidad específica de su cuenta.
  - **Cerrar sesión**: El usuario cierra sesión y sale del menú.

---

### **4. Bakiye Görüntüleme (Check Balance) / Check Balance / Ver saldo**

#### Türkçe:
- Kullanıcı **"Bakiye Görüntüle"** seçeneğini seçtiğinde, sistem kullanıcının hesabındaki bakiyeyi görüntüler.
- Kullanıcı bakiyesini ekranda görür.

#### English:
- When the user selects the **"Check Balance"** option, the system displays the user's current account balance.
- The user sees their balance on the screen.

#### Español:
- Cuando el usuario selecciona la opción **"Ver saldo"**, el sistema muestra el saldo actual de la cuenta del usuario.
- El usuario ve su saldo en la pantalla.

---

### **5. Şifre Değiştirme (Change Password) / Change Password / Cambiar contraseña**

#### Türkçe:
- Kullanıcı **"Şifre Değiştir"** seçeneğini seçer.
- Sistemdeki mevcut şifre doğrulanır, sonra kullanıcı yeni bir şifre belirler.
- Yeni şifre sistemde güncellenir.

#### English:
- The user selects the **"Change Password"** option.
- The current password is verified, then the user sets a new password.
- The new password is updated in the system.

#### Español:
- El usuario selecciona la opción **"Cambiar contraseña"**.
- Se verifica la contraseña actual, luego el usuario establece una nueva contraseña.
- La nueva contraseña se actualiza en el sistema.

---

### **6. Para Yatırma (Deposit Money) / Deposit Money / Depositar dinero**

#### Türkçe:
- Kullanıcı **"Para Yatırma"** seçeneğini seçer.
- Kullanıcı, yatırmak istediği miktarı girer ve sistem bakiyeyi günceller.

#### English:
- The user selects the **"Deposit Money"** option.
- The user enters the amount they want to deposit, and the system updates the balance.

#### Español:
- El usuario selecciona la opción **"Depositar dinero"**.
- El usuario ingresa la cantidad que desea depositar, y el sistema actualiza el saldo.

---

### **7. Para Çekme (Withdraw Money) / Withdraw Money / Retirar dinero**

#### Türkçe:
- Kullanıcı **"Para Çekme"** seçeneğini seçer.
- Kullanıcı, çekmek istediği miktarı girer.
- Sistem, bakiye yetersizse hata mesajı verir. Yeterli bakiye varsa, bakiye güncellenir.

#### English:
- The user selects the **"Withdraw Money"** option.
- The user enters the amount they want to withdraw.
- If the balance is insufficient, the system displays an error message. If the balance is sufficient, the balance is updated.

#### Español:
- El usuario selecciona la opción **"Retirar dinero"**.
- El usuario ingresa la cantidad que desea retirar.
- Si el saldo es insuficiente, el sistema muestra un mensaje de error. Si el saldo es suficiente, el saldo se actualiza.

---

### **8. Çıkış (Logout) / Logout / Cerrar sesión**

#### Türkçe:
- Kullanıcı **"Çıkış"** seçeneğini seçtiğinde, kullanıcı oturumunu kapatır ve menüden çıkar.

#### English:
- When the user selects the **"Logout"** option, the user logs out and exits the menu.

#### Español:
- Cuando el usuario selecciona la opción **"Cerrar sesión"**, el usuario cierra sesión y sale del menú.

---

### **Özet / Summary / Resumen**

#### Türkçe:
1. Kullanıcı giriş yapar.
2. Kayıt işlemi yapılabilir.
3. Kullanıcı menüsüne erişilir.
4. Bakiye görüntülenir.
5. Şifre değiştirilir.
6. Para yatırma işlemi yapılır.
7. Para çekme işlemi yapılır.
8. Çıkış yapılır.

#### English:
1. The user logs in.
2. A registration process can be performed.
3. The user accesses the menu.
4. The balance is checked.
5. The password is changed.
6. Money is deposited.
7. Money is withdrawn.
8. The user logs out.

#### Español:
1. El usuario inicia sesión.
2. Se puede realizar un proceso de registro.
3. El usuario accede al menú.
4. Se consulta el saldo.
5. Se cambia la contraseña.
6. Se deposita dinero.
7. Se retira dinero.
8. El usuario cierra sesión.

---
