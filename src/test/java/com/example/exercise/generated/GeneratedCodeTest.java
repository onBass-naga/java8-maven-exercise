package com.example.exercise.generated;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.IOException;
import java.io.Reader;
import java.sql.Date;
import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GeneratedCodeTest {

    private static final long PRODUCT_ID = 777;

    @BeforeClass
    public static void init() {
        try (Reader r = getConfigAsReader()) {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
            try (SqlSession session = factory.openSession()) {

                ProductsMapper mapper = session.getMapper(ProductsMapper.class);
                mapper.deleteByPrimaryKey(PRODUCT_ID);

                session.commit();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void _01_insertできる() {
        try (Reader r = getConfigAsReader()) {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
            try (SqlSession session = factory.openSession()) {

                Products product = new Products();
                product.setId(PRODUCT_ID);
                product.setName("textbook");
                product.setSalesStartDate(Date.valueOf("2019-05-01"));

                ProductsMapper mapper = session.getMapper(ProductsMapper.class);
                int countInserted = mapper.insert(product);
                assertEquals(1, countInserted);

                session.commit();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void _02_指定した項目のみupdateできる() {
        try (Reader r = getConfigAsReader()) {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
            try (SqlSession session = factory.openSession()) {

                Products product = new Products();
                product.setId(PRODUCT_ID);
                product.setSalesEndDate(Date.valueOf("2019-09-10"));

                ProductsMapper mapper = session.getMapper(ProductsMapper.class);
                int countUpdated = mapper.updateByPrimaryKeySelective(product);
                assertEquals(1, countUpdated);

                session.commit();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void _03_Exampleを使用してselectできる() {
        try (Reader r = getConfigAsReader()) {

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
            try (SqlSession session = factory.openSession()) {

                ProductsExample ex = new ProductsExample();
                ex.createCriteria()
                        .andNameLike("text%")
                        .andSalesEndDateIsNotNull();

                ProductsMapper mapper = session.getMapper(ProductsMapper.class);
                List<Products> products = mapper.selectByExample(ex);
                assertEquals(0, products.get(0).getName().indexOf("text"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Reader getConfigAsReader() throws IOException {
        return Resources.getResourceAsReader(Thread.currentThread().getContextClassLoader(),
                "mybatis-config.xml");
    }
}
