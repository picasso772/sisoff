package longnd.com.vn.thesis.ui.evaluate.detail;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;

import longnd.com.vn.thesis.utils.EvaluateUtils;

public class DetailViewModel extends ViewModel {
    @Inject
    DetailViewModel() {

    }

    /**
     * Use calculating points for anchors by gender
     *
     * @param gender  0 : Female 1 : Male
     * @param results
     * @return
     */
    public int[] getResultsnNeo(int gender, int[] results) {
        if (gender == 0) {
            return EvaluateUtils.evaluateNeoFemale(results);
        } else if (gender == 1) {
            return EvaluateUtils.evaluateNeoMale(results);
        } else {
            return null;
        }
    }
}
