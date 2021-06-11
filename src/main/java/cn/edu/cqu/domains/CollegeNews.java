package cn.edu.cqu.domains;

/***********************************************************************
 * Module:  CollegeNews.java
 * Author:  Guo
 * Purpose: Defines the Class CollegeNews
 ***********************************************************************/


/** @pdOid 872ef93e-7de3-4685-8094-6c6d82e4a57f */
public class CollegeNews {
   /** @pdOid bae9ad64-35da-4a90-844a-8166c19d1d64 */
   public int cNewsID;
   /** @pdOid e246a107-8438-42ed-a6fa-a01ac22fd9fc */
   public java.util.Date cNewsDate;
   /** @pdOid 2fca85c2-6f40-4614-b863-35cb842828fa */
   public java.lang.String cNewsURL;
   /** @pdOid c6ec5c12-6250-4887-83e4-04429d473558 */
   public java.lang.String cNewsImgURL;
   /** @pdOid 0584983a-c76a-4ff6-801d-bc3f1fd193c3 */
   public java.lang.String cNewsContent;
   
   /** @pdRoleInfo migr=no name=Admin assc=reference1 mult=0..1 side=A */
   public Admin admin;
   
   
   /** @pdGenerated default parent getter */
   public Admin getAdmin() {
      return admin;
   }
   
}