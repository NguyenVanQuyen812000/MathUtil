/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static quyen.util.MathUtil.computeFactorial;

/**
 *
 * @author User
 */
public class MathUtilTest {
    
    @Test   //báo cho JVM biết rằng đây là hàm main()
    // trong hàm này chứa các lệnh để test code chính của mình
    // ở bên MathUtil
    // ta test các tình huống ở đây
    // thành công: cF(5) -> trả về 120 gọi là thành công
    public void testSuccessfulCase() {
        //assertEquals(30, 50);
        // tao kì vọng có 30, xem mày đưa vào thực tế là bao nhiêu 
        //                                               50
        // 2 thứ khớp nhau, mày xử lí như dự kiến, đèn xanh, thông đường
        //                            không như kì vọng, đèn đỏ, toang code này
        
        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));
        assertEquals(1, computeFactorial(0));
        assertEquals(1, computeFactorial(1));
        assertEquals(2, computeFactorial(2));
        //muốn xanh, thì tất cả phải xanh, đúng hết cho mọi case
        //nếu tất cả xanh, có 1 thằng đỏ, coi như cả đám đỏ
        //vì hàm ý: code phải đúng cho mọi tình huống
        //ta chỉ cần nhìn xanh đỏ, khỏi cần dò từng cháu = bắt
    }
    
    @Test(expected = IllegalArgumentException.class)  
    //annotation, dấu hiệu báo cho JVM và thư viện jar liên quan cần phải làm gì
    //hàm này chứa các tình huống cà chớn, ví dụ cF(-5), cF(16)
    
    public void testFailedCase() {
        //tao kì vọng mày ném ra ngoại lệ thì coi như code của mày mới ngon
        //vì -5 không thể tính đc
        //ngoại lệ không phải là 1 value để có thể so sánh đc
        //nên mình không có xài hàm assertEquals() đc
        //vì hàm này cần 2 value excepted và actual
        //ta phải xài chiêu khác khi bắt ngoại lệ coi có đúng
        //là ngoại lẹ mình cần không
        computeFactorial(-5);
        computeFactorial(16);   //giai thừa tăng rất nhanh, ko chơi quá 15
    }
    
    //code có thể còn tiềm ẩn lỗi logic nhưng Clean & Build
    //luôn ra file .jar nếu code ko sai cú pháp
    //vậy thì nguy hiểm quá đi
    //mình phải disable cái nút CLEAN & BUILD nếu code còn màu đỏ
    //tức là còn error logic
    //nhớ 2 con số: 1005 Netbeans 8, 1204 Netbeans 10 trở lên
    //khi chơi với Ant Project
}
