package org.linlinjava.litemall.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class LitemallUserTree {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_user_tree
     *
     * @mbg.generated
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_user_tree
     *
     * @mbg.generated
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_tree.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_tree.ancestor
     *
     * @mbg.generated
     */
    private Integer ancestor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_tree.descendant
     *
     * @mbg.generated
     */
    private Integer descendant;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_tree.distance
     *
     * @mbg.generated
     */
    private Boolean distance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_tree.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_tree.id
     *
     * @return the value of litemall_user_tree.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_tree.id
     *
     * @param id the value for litemall_user_tree.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_tree.ancestor
     *
     * @return the value of litemall_user_tree.ancestor
     *
     * @mbg.generated
     */
    public Integer getAncestor() {
        return ancestor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_tree.ancestor
     *
     * @param ancestor the value for litemall_user_tree.ancestor
     *
     * @mbg.generated
     */
    public void setAncestor(Integer ancestor) {
        this.ancestor = ancestor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_tree.descendant
     *
     * @return the value of litemall_user_tree.descendant
     *
     * @mbg.generated
     */
    public Integer getDescendant() {
        return descendant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_tree.descendant
     *
     * @param descendant the value for litemall_user_tree.descendant
     *
     * @mbg.generated
     */
    public void setDescendant(Integer descendant) {
        this.descendant = descendant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_tree.distance
     *
     * @return the value of litemall_user_tree.distance
     *
     * @mbg.generated
     */
    public Boolean getDistance() {
        return distance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_tree.distance
     *
     * @param distance the value for litemall_user_tree.distance
     *
     * @mbg.generated
     */
    public void setDistance(Boolean distance) {
        this.distance = distance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_tree
     *
     * @mbg.generated
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_tree.deleted
     *
     * @return the value of litemall_user_tree.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_tree.deleted
     *
     * @param deleted the value for litemall_user_tree.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_tree
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", IS_DELETED=").append(IS_DELETED);
        sb.append(", NOT_DELETED=").append(NOT_DELETED);
        sb.append(", id=").append(id);
        sb.append(", ancestor=").append(ancestor);
        sb.append(", descendant=").append(descendant);
        sb.append(", distance=").append(distance);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_tree
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallUserTree other = (LitemallUserTree) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAncestor() == null ? other.getAncestor() == null : this.getAncestor().equals(other.getAncestor()))
            && (this.getDescendant() == null ? other.getDescendant() == null : this.getDescendant().equals(other.getDescendant()))
            && (this.getDistance() == null ? other.getDistance() == null : this.getDistance().equals(other.getDistance()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_tree
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAncestor() == null) ? 0 : getAncestor().hashCode());
        result = prime * result + ((getDescendant() == null) ? 0 : getDescendant().hashCode());
        result = prime * result + ((getDistance() == null) ? 0 : getDistance().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_user_tree
     *
     * @mbg.generated
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_user_tree
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        ancestor("ancestor", "ancestor", "INTEGER", false),
        descendant("descendant", "descendant", "INTEGER", false),
        distance("distance", "distance", "BIT", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_tree
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}