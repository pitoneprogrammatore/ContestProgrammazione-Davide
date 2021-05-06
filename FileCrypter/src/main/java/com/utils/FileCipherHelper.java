package com.utils;
import java.io.File;import java.io.FileInputStream;import java.io.FileOutputStream;import javax.crypto.Cipher;import javax.crypto.SecretKey;import javax.crypto.spec.SecretKeySpec;
public class FileCipherHelper {
	public static void encryptedFile(String chiave, String fileInputPath, String fileOutPath) throws Exception {
	SecretKey key = new SecretKeySpec(chiave.getBytes(), "AES");
	Cipher cipher = Cipher.getInstance("AES");cipher.init(Cipher.ENCRYPT_MODE, key);
	File fileInput = new File(fileInputPath);FileInputStream inputStream = new FileInputStream(fileInput);byte[] inputBytes = new byte[(int) fileInput.length()];inputStream.read(inputBytes);
	byte[] outputBytes = cipher.doFinal(inputBytes);File fileEncryptOut = new File(fileOutPath);FileOutputStream outputStream = new FileOutputStream(fileEncryptOut);outputStream.write(outputBytes);
	inputStream.close();outputStream.close();}public static void decryptedFile(String chiave, String fileInputPath, String fileOutPath)throws Exception {
		SecretKey key = new SecretKeySpec(chiave.getBytes(), "AES");Cipher cipher = Cipher.getInstance("AES");cipher.init(Cipher.DECRYPT_MODE, key);
		File fileInput = new File(fileInputPath);FileInputStream inputStream = new FileInputStream(fileInput);byte[] inputBytes = new byte[(int) fileInput.length()];inputStream.read(inputBytes);
		byte[] outputBytes = cipher.doFinal(inputBytes);File fileEncryptOut = new File(fileOutPath);FileOutputStream outputStream = new FileOutputStream(fileEncryptOut);
		outputStream.write(outputBytes);inputStream.close();outputStream.close();}}