package LopHoc;

import java.util.ArrayList;

public interface ILopHocDAO {

    public ArrayList<LopHoc> getAll();

    public ArrayList<LopHoc> findByIDKhoa(String maKhoa);

    public LopHoc addNew(LopHoc lh);

    public LopHoc updateByID(LopHoc lh);

    public ArrayList<LopHoc> checkID(String malop);
}
