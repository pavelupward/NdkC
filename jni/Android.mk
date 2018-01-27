LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := password-jni
LOCAL_SRC_FILES := pass.c
include $(BUILD_EXECUTABLE)