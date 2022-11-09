package test.Categorized;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(FastTests.class)
@ExcludeCategory(SlowTests.class)

// ! SuiteClassesでテスト対象のクラスを指定する。未指定の場合エラーとなる。
@SuiteClasses({ FooTest.class, BarTest.class })
public class CategorizedTest {

}
