package com.bupt.dao.entity;

public class Bgm {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bgm.id
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bgm.author
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bgm.name
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bgm.path
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    private String path;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bgm.id
     *
     * @return the value of bgm.id
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bgm.id
     *
     * @param id the value for bgm.id
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bgm.author
     *
     * @return the value of bgm.author
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bgm.author
     *
     * @param author the value for bgm.author
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bgm.name
     *
     * @return the value of bgm.name
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bgm.name
     *
     * @param name the value for bgm.name
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bgm.path
     *
     * @return the value of bgm.path
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bgm.path
     *
     * @param path the value for bgm.path
     *
     * @mbg.generated Sat Jan 04 21:33:45 CST 2020
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}