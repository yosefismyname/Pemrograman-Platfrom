public class enkripsiGenerator {

    public static String enkripsiGenerator(String data) {

        String encryptedpassword = null;
        try {

            MessageDigest m = MessageDigest.getInstance("MD5");

            m.update(data.getBytes());

            byte[] bytes = m.digest();

            StringBuilder s = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            encryptedpassword = s.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        String hasil = encryptedpassword;
        return hasil;
    }


}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
