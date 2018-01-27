#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_pavel_project_ndk_ndkc_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string password = "include lib";
    return env->NewStringUTF(password.c_str());
}
