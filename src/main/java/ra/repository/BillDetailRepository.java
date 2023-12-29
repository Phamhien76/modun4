package ra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.model.BillDetail;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail,Integer> {
}
