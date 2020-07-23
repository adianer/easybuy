package pojo;

public class News {
   private Integer id;//主键
   private String title;//标题
   private String contebt;//内容
   private String createTime;//创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContebt() {
        return contebt;
    }

    public void setContebt(String contebt) {
        this.contebt = contebt;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
