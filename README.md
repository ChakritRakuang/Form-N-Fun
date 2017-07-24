# Form-N-Fun

รูปแบบของเกมส์ N Fun เป็นการสร้างเกมลูกบอลกับเขาวงกตในกระดาษบนแนวของคอมพิวเตอร์วิชชั้นแบบเรียวทาม เอกลัษณืของเกมส์นี้ผู้เล่นออกแบบเขาวงกตของตัวเองบนกระดาษแล้ววาดด้วยปากกาหรือดินสอก็ได้เพื่อใช้ในการเล่นเกม โดยตัวเกมจะจำลองสิ่งที่วาดในกระดาษมาใช้เป็นลักษณะเสมือนจริงเหมือนกับที่วาดไว้บนแนวคิด opencv โดยใช้ JBOX2d engine

<b>ดาวโหลด APK</b>

ดาวโหลด apk file ได้ที่โฟลเดอร์ apk file

<b>ปรับเปลี่ยน</b>
1) <b>Resolution:</b> กำหนดความละเอียดไว้ที่  1280x960 (less than or equal). ค่าความละเอียดสร้างแก้ไขได้จากบรรทัดนี้ [line](https://github.com/ChakritRakuang/Form-N-Fun/tree/master/app/src/main/java/com/formfun/MainActivity.java#L284).

2) <b>ขอบเขต  Pitch และ Roll:</b> Pitch และ Roll are จำกัดถึง  3.8, limiting ค่าาาลูสามารถแก้ไขได้ที่นี้ [MIN](https://github.com/ChakritRakuang/Form-N-Fun/tree/master/app/src/main/java/com/formfun/graphics/GraphicThread.java#L43) and [MAX](https://github.com/Rohithkvsp/Form-N-Fun/blob/master/app/src/main/java/com/formfun/graphics/GraphicThread.java#L44). [Here](https://github.com/Rohithkvsp/Form-N-Fun/blob/master/app/src/main/java/com/formfun/graphics/GraphicThread.java#L69) is the implementation of limiting function.

3) <b>บังคับลูกบอล:</b> สามารถแก้ไยสีของลูกบอลและขนาดได้ที่นี้ [here](https://github.com/ChakritRakuang/Form-N-Fun/tree/master/app/src/main/java/com/formfun/graphics/Ball.java#L69).

4) <b>สีของบอล:</b> สีของลูกบอลแก้ไขได้ที่นี้[here](https://github.com/ChakritRakuang/Form-N-Fun/tree/master/app/src/main/java/com/formfungraphics/Ball.java#L57).

<b>คำแนะนำ</b>

ดาโหลด <b>OpenCV for Android</b> (ในแอปผมใช้ โอเพ่นซีวี 3.0.0) จาก http://opencv.org/releases.html และดึงไฟล์และแยกไฟล์ไปยัง C:\opencv\OpenCV-3.0-android-sdk (I am using Windows Machine)

เปิดไฟล์ไปที่ <b>local.properties</b> เซ็ตไฟล์ <b>ndk.dir</b> to the path of Android NDK folder.

ตัวอย่างเช่น  Windows local.properties มีลักษณะดังนี้

<b>sdk.dir = C\:\\android_sdk</b>

<b>ndk.dir = C\:\\android_ndk</b>


เปิด <b>Android.mk</b> ไฟล์ใน <b>jni folder</b>, แก้ไข <b>ส่งออก OPENCV_PACKAGE_DIR</b> แตกไฟล์ OpenCV Path

ตัวอย่างสำหรับผู้ใช้ Windows

<b>ส่งออกไฟล์ OPENCV_PACKAGE_DIR = C:/opencv/OpenCV-3.0-android-sdk</b>

<b>ผลการันแอป</b> หลังจากการเปลี่ยนแปลงค่าต่างๆขั้นต้น

<b>บันทึกผลการทดลอง:</b>

ผมสร้างไว้ทำสอบได้ทุกอุปกรณื แต่อุปกรณ์ที่ผมเทสเป็น <b>samsung a9 pro</b> 

<b>APP_ABI := arm64-v8a armeabi armeabi-v7a mips mips64 x86 x86_64</b>

ถ้าคุณต้องการสร้างแอปเฉพาะอุปกรณ์จากนั้นให้แก้ไข <b>particular device</b> then modify <b>APP_ABI to device ABIs</b> ใน Application.mk in jni folder.

For example, to build App only for <b>Nexus 5x</b> then modify <b>APP_ABI</b> to <b>APP_ABI:=arm64-v8a</b> in Application.mk (NEXUS 5X has ARMv8 based CPU supports AArch64).

<b>APP_ABI := arm64-v8a</b>

