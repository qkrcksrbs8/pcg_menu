package cg.park.pcg_menu.api.services;

import cg.park.pcg_menu.api.domain.Coffee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AmericanoService {

    public List<Coffee> list () {
        return pcgList();
    }

    public Coffee signature() {
        return pcg();
    }

    public Coffee pcg() {
        return new Coffee()
                .addName("PCG 아메리카노")
                .addDescription("PCG 매장의 시그니처 아메리카노입니다.")
                .addPrice(5000);
    }

    public ArrayList<Coffee> pcgList() {
        ArrayList<Coffee> list = new ArrayList<>();
        Coffee coffee1 = new Coffee()
                .addName("PCG 아메리카노")
                .addDescription("PCG 매장의 시그니처 아메리카노입니다.")
                .addPrice(5000);
        Coffee coffee2 = new Coffee()
                .addName("헤이즐넛")
                .addDescription("헤이즐넛 커피입니다.")
                .addPrice(6000);
        Coffee coffee3 = new Coffee()
                .addName("아이스티")
                .addDescription("아이스티입니다.")
                .addPrice(3000);
        list.add(coffee1);
        list.add(coffee2);
        list.add(coffee3);
        return list;
    }
}
