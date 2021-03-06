package dao.imp;

import dao.ProductDao;
import pojo.Product;
import util.BaseDao;
import util.Page;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImp implements ProductDao {
    //获取显示列表
    @Override
    public List getshowlist(Page page) throws Exception {
        List list=new ArrayList();
        String sql="SELECT `id`,`name`,`description`,`price`,`stock`,`categoryLevel1Id`,`categoryLevel2Id`,`categoryLevel3Id`," +
                "`fileName`,`isDelete` FROM `easybuy_product` ORDER BY `id` limit ?,?";
        List<Object> objects = new ArrayList<Object>();
        objects.add(page.getPageSize()*(page.getPageNo()-1));
        objects.add(page.getPageSize());
        BaseDao baseDao = new BaseDao();
        ResultSet rs= baseDao.executeQuery(sql,objects.toArray());
        Product product;
        while (rs.next())
        {
            product=new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setDescription(rs.getString("description"));
            product.setPrice(rs.getFloat("price"));
            product.setStock(rs.getInt("stock"));
            product.setCategoryLevel1Id(rs.getInt("categoryLevel1Id"));
            product.setCategoryLevel2Id(rs.getInt("categoryLevel2Id"));
            product.setCategoryLevel3Id(rs.getInt("categoryLevel3Id"));
            product.setFileName(rs.getString("fileName"));
            product.setIsDelete(rs.getInt("isDelete"));
            list.add(product);
        }
        return  list;
    }


    //获取总记录数
    @Override
    public int getCount(){
        String sql="SELECT COUNT(1) FROM easybuy_product";
        List<Object> o=new ArrayList<>();
        BaseDao base=new BaseDao();
        ResultSet rs= base.executeQuery(sql);
        int count=0;
        try {
            if(rs.next()){
                count=rs.getInt(1);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return count;
    }

    //添加商品
    @Override
    public int insertProduct(List<Object> objects ){
        int i=0;
        BaseDao baseDao=new BaseDao();
        String sql="insert easybuy_product (`categoryLevel1Id`,`categoryLevel2Id`,`categoryLevel3Id`,`name`,`fileName`,`price`,`stock`,`description`) values( ?,?,?,?,?,?,?,?)";
        try {
            i = baseDao.executeUpdate(sql, objects.toArray());
        }catch (Exception e){
            e.printStackTrace();
            i=-1;
        }
        return i;
    }

    //修改商品
    @Override
    public int updataProduct(List<Object> objects ){
        int i=0;
        BaseDao baseDao=new BaseDao();
        String sql="update easybuy_product set `categoryLevel1Id`=?,`categoryLevel2Id`=?,`categoryLevel3Id`=?,`name`=?,`fileName`=?,`price`=?,`stock`=?,`description`=? where id=?";
        try {
            i = baseDao.executeUpdate(sql, objects.toArray());
        }catch (Exception e){
            e.printStackTrace();
            i=-1;
        }
        return i;
    }
    //根据ID删除
    @Override
    public int deleteProduct(int id){
        int i=0;
        BaseDao baseDao=new BaseDao();
        String sql="DELETE FROM easybuy_product where id =?";
        List<Object> objects = new ArrayList<Object>();
        objects.add(id);
        i=baseDao.executeUpdate(sql,objects.toArray());
        return i;
    }

    //根据id查询
    @Override
    public Product querybyId(int id) {
        Product product=null;
        String sql="SELECT id,name,description,price,stock,categoryLevel1Id,categoryLevel2Id,categoryLevel3Id,fileName,isDelete FROM easybuy_product WHERE id=?";
        List<Object> o=new ArrayList<>();
        o.add(id);
        BaseDao base=new BaseDao();
        ResultSet rs= base.executeQuery(sql ,o.toArray());
        try {
            if(rs.next()){
                product=new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getFloat("price"));
                product.setStock(rs.getInt("stock"));
                product.setCategoryLevel1Id(rs.getInt("categoryLevel1Id"));
                product.setCategoryLevel2Id(rs.getInt("categoryLevel2Id"));
                product.setCategoryLevel3Id(rs.getInt("categoryLevel3Id"));
                product.setFileName(rs.getString("fileName"));
                product.setIsDelete(rs.getInt("isDelete"));
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return product;
    }
}
