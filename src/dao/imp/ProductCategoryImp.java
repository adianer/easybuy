package dao.imp;

import dao.ProductCategoryDao;
import pojo.ProductCategory;
import util.BaseDao;
import util.Page;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductCategoryImp implements ProductCategoryDao {
    //获取显示列表
    @Override
    public List getshowlist(Page page) throws Exception {
        List list=new ArrayList();
        String sql="SELECT a.id,a.name ,b.name AS parentname ,a.parentId ,a.type  FROM easybuy_product_category AS a  LEFT JOIN  easybuy_product_category AS b ON b.id=a.parentId ORDER BY parentId limit ?,?";
        List<Object> objects = new ArrayList<Object>();
        objects.add(page.getPageSize()*page.getPageNo());
        objects.add(page.getPageSize());
        BaseDao baseDao = new BaseDao();
        ResultSet rs= baseDao.executeQuery(sql,objects.toArray());
        ProductCategory category;
        while (rs.next())
        {
            category=new ProductCategory();
            category.setId(rs.getInt("id"));
            category.setName(rs.getString("name"));
            category.setParentId(rs.getInt("parentId"));
            category.setParentName(rs.getString("parentName"));
            category.setType(rs.getInt("type"));
            list.add(category);
        }
        return  list;
    }


    //获取总记录数
    @Override
    public int getCount(){
        String sql="SELECT COUNT(1) FROM easybuy_product_category";
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

    //添加商品分类
    @Override
    public int insertProductCategory(List<Object> objects ){
        int i=0;
        BaseDao baseDao=new BaseDao();
        String sql="insert easybuy_product_category (type,name,parentId)values( ?,?,?)";
        try {
            i = baseDao.executeUpdate(sql, objects.toArray());
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    //获取父类id
    @Override
    public int getid(String name) throws SQLException {
        int i=0;
        BaseDao baseDao = new BaseDao();
        String a = "SELECT id FROM easybuy_product_category WHERE name='";
        a+=name+"'";
        ResultSet rs = baseDao.executeQuery(a);
        try{
            if(rs!=null){
                rs.next();
                i = rs.getInt("id");
            }
        }catch (Exception e){
            i=-1;
        }
        return i;

    }

    //根据ID删除
    @Override
    public int deleteProductCategory(int id){
        int i=0;
        BaseDao baseDao=new BaseDao();
        String sql="DELETE FROM easybuy_product_category where id =";
        sql+=id;
        i=baseDao.executeUpdate(sql);
        return i;
    }
}

