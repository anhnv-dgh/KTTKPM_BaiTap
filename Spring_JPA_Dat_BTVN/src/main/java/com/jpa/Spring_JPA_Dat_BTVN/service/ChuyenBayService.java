package com.jpa.Spring_JPA_Dat_BTVN.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.Spring_JPA_Dat_BTVN.enity.ChuyenBay;

@Service
public interface ChuyenBayService {
	public List<ChuyenBay> findByGaDen(String gaden);
	public List<ChuyenBay> findChuyenBayByDoDai(int minDoDai, int maxDoDai);
    public List<ChuyenBay> findByGadiAndGaden(String gadi, String gaden);
    public Integer countByGaDi(String gadi);
}
