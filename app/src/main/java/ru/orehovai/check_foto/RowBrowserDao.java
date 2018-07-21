package ru.orehovai.check_foto;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface RowBrowserDao {

    @Query("Select * from RowBrowser")
    List<RowBrowser> getListBrowser();

    @Query("Select * from RowBrowser where id = :id")
    RowBrowser getRow(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(RowBrowser rowBrowser);

    @Update
    void update(RowBrowser rowBrowser);

    @Delete
    void delete(RowBrowser rowBrowser);

}
