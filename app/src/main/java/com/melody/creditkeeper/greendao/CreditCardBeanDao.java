package com.melody.creditkeeper.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.melody.creditkeeper.beans.bank.BankBean;
import com.melody.creditkeeper.beans.bank.BankBeanCover;

import com.melody.creditkeeper.beans.CreditCardBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CREDIT_CARD_BEAN".
*/
public class CreditCardBeanDao extends AbstractDao<CreditCardBean, Long> {

    public static final String TABLENAME = "CREDIT_CARD_BEAN";

    /**
     * Properties of entity CreditCardBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CardName = new Property(1, String.class, "cardName", false, "CARD_NAME");
        public final static Property Bank = new Property(2, String.class, "bank", false, "BANK");
        public final static Property CardNum = new Property(3, String.class, "cardNum", false, "CARD_NUM");
        public final static Property Amount = new Property(4, double.class, "amount", false, "AMOUNT");
        public final static Property SurpulsAmount = new Property(5, double.class, "surpulsAmount", false, "SURPULS_AMOUNT");
        public final static Property IsQuota = new Property(6, boolean.class, "isQuota", false, "IS_QUOTA");
        public final static Property Quota = new Property(7, double.class, "quota", false, "QUOTA");
        public final static Property ValidDataStart = new Property(8, java.util.Date.class, "validDataStart", false, "VALID_DATA_START");
        public final static Property ValidDataEnd = new Property(9, java.util.Date.class, "validDataEnd", false, "VALID_DATA_END");
        public final static Property BillDate = new Property(10, int.class, "billDate", false, "BILL_DATE");
        public final static Property RepaymentDate = new Property(11, int.class, "repaymentDate", false, "REPAYMENT_DATE");
        public final static Property Phone = new Property(12, String.class, "phone", false, "PHONE");
        public final static Property Name = new Property(13, String.class, "name", false, "NAME");
        public final static Property Remark = new Property(14, String.class, "remark", false, "REMARK");
    }

    private final BankBeanCover bankConverter = new BankBeanCover();

    public CreditCardBeanDao(DaoConfig config) {
        super(config);
    }
    
    public CreditCardBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CREDIT_CARD_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CARD_NAME\" TEXT," + // 1: cardName
                "\"BANK\" TEXT," + // 2: bank
                "\"CARD_NUM\" TEXT," + // 3: cardNum
                "\"AMOUNT\" REAL NOT NULL ," + // 4: amount
                "\"SURPULS_AMOUNT\" REAL NOT NULL ," + // 5: surpulsAmount
                "\"IS_QUOTA\" INTEGER NOT NULL ," + // 6: isQuota
                "\"QUOTA\" REAL NOT NULL ," + // 7: quota
                "\"VALID_DATA_START\" INTEGER," + // 8: validDataStart
                "\"VALID_DATA_END\" INTEGER," + // 9: validDataEnd
                "\"BILL_DATE\" INTEGER NOT NULL ," + // 10: billDate
                "\"REPAYMENT_DATE\" INTEGER NOT NULL ," + // 11: repaymentDate
                "\"PHONE\" TEXT," + // 12: phone
                "\"NAME\" TEXT," + // 13: name
                "\"REMARK\" TEXT);"); // 14: remark
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CREDIT_CARD_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CreditCardBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String cardName = entity.getCardName();
        if (cardName != null) {
            stmt.bindString(2, cardName);
        }
 
        BankBean bank = entity.getBank();
        if (bank != null) {
            stmt.bindString(3, bankConverter.convertToDatabaseValue(bank));
        }
 
        String cardNum = entity.getCardNum();
        if (cardNum != null) {
            stmt.bindString(4, cardNum);
        }
        stmt.bindDouble(5, entity.getAmount());
        stmt.bindDouble(6, entity.getSurpulsAmount());
        stmt.bindLong(7, entity.getIsQuota() ? 1L: 0L);
        stmt.bindDouble(8, entity.getQuota());
 
        java.util.Date validDataStart = entity.getValidDataStart();
        if (validDataStart != null) {
            stmt.bindLong(9, validDataStart.getTime());
        }
 
        java.util.Date validDataEnd = entity.getValidDataEnd();
        if (validDataEnd != null) {
            stmt.bindLong(10, validDataEnd.getTime());
        }
        stmt.bindLong(11, entity.getBillDate());
        stmt.bindLong(12, entity.getRepaymentDate());
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(13, phone);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(14, name);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(15, remark);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CreditCardBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String cardName = entity.getCardName();
        if (cardName != null) {
            stmt.bindString(2, cardName);
        }
 
        BankBean bank = entity.getBank();
        if (bank != null) {
            stmt.bindString(3, bankConverter.convertToDatabaseValue(bank));
        }
 
        String cardNum = entity.getCardNum();
        if (cardNum != null) {
            stmt.bindString(4, cardNum);
        }
        stmt.bindDouble(5, entity.getAmount());
        stmt.bindDouble(6, entity.getSurpulsAmount());
        stmt.bindLong(7, entity.getIsQuota() ? 1L: 0L);
        stmt.bindDouble(8, entity.getQuota());
 
        java.util.Date validDataStart = entity.getValidDataStart();
        if (validDataStart != null) {
            stmt.bindLong(9, validDataStart.getTime());
        }
 
        java.util.Date validDataEnd = entity.getValidDataEnd();
        if (validDataEnd != null) {
            stmt.bindLong(10, validDataEnd.getTime());
        }
        stmt.bindLong(11, entity.getBillDate());
        stmt.bindLong(12, entity.getRepaymentDate());
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(13, phone);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(14, name);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(15, remark);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CreditCardBean readEntity(Cursor cursor, int offset) {
        CreditCardBean entity = new CreditCardBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // cardName
            cursor.isNull(offset + 2) ? null : bankConverter.convertToEntityProperty(cursor.getString(offset + 2)), // bank
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // cardNum
            cursor.getDouble(offset + 4), // amount
            cursor.getDouble(offset + 5), // surpulsAmount
            cursor.getShort(offset + 6) != 0, // isQuota
            cursor.getDouble(offset + 7), // quota
            cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)), // validDataStart
            cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)), // validDataEnd
            cursor.getInt(offset + 10), // billDate
            cursor.getInt(offset + 11), // repaymentDate
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // phone
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // name
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14) // remark
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CreditCardBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCardName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBank(cursor.isNull(offset + 2) ? null : bankConverter.convertToEntityProperty(cursor.getString(offset + 2)));
        entity.setCardNum(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAmount(cursor.getDouble(offset + 4));
        entity.setSurpulsAmount(cursor.getDouble(offset + 5));
        entity.setIsQuota(cursor.getShort(offset + 6) != 0);
        entity.setQuota(cursor.getDouble(offset + 7));
        entity.setValidDataStart(cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)));
        entity.setValidDataEnd(cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)));
        entity.setBillDate(cursor.getInt(offset + 10));
        entity.setRepaymentDate(cursor.getInt(offset + 11));
        entity.setPhone(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setName(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setRemark(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CreditCardBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CreditCardBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CreditCardBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
