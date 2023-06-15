/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.ductri.mathutil.core.test;

import static org.ductri.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityAdvancedTest {
    
    //tạo mảng 2 chiều chứa data sẽ dùng cho việt assertE()
    //gồm n đưa vào và expected trả về
    //  int         long -> Object (wrapper class)
    //                              Integer Long
    public static Object[][] initTestData(){
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {5, 120}};
        
        return testData;
    }
    //nhồi data này vào hàm assertE()
    @ParameterizedTest
    @MethodSource("initTestData")
                                                          // cột 0      cột 1
    public void testFactorialGivenRoghtArgumentReturnsWell(int n, long expected){
        //assertEquals(69,70);   
        assertEquals(expected, getFactorial(n));
    }
}

//TDD: Test Driven Development là kĩ thuật lập trình mà nó
//      đc gắn với việc viết các test case để kiểm thử ngay nhũng hàm
//      dev mình vừa viết
//      Viết code chính và viết code test (JUnit, Unit Test) xen kẽ
//      với nhau, 2 màu XANH ĐỎ LIÊN TỤC DIỄN RA

//DDT: xuwh mở rộng thêm cho quá trình vết code test (JUnit)
//      Data Driven Testing
//      kĩ thuật tách bộ test data ra 1 chổ riên, tách vào mảng
//      tách vào file Excel, hay table; sau đó nhồi/fill/map
//      cái data từ mảng này vào trong hàm so sánh assertEquals()
//      Gips code dể đọc hơn, dể kiểm tra xem còn thiếu test case
//      nào hay ko


