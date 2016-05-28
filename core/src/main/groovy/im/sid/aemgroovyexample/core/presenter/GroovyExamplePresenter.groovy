package im.sid.aemgroovyexample.core.presenter;

import com.adobe.cq.sightly.WCMUsePojo

import javax.swing.text.html.CSS;

/**
 * Created by sid.dahari on 14/05/2016.
 */
class GroovyExamplePresenter extends WCMUsePojo {

    final HEADING_PROP_NAME = 'heading'
    final HEADING_COLOR_PROP_NAME = 'headingColor'
    final CSS_CLASS_NAME_MAP = [
        'red': 'groovy-red', 'blue' : 'groovy-blue',
        'yellow' : 'groovy-yellow', 'green' : 'groovy-green'
    ]

    def stringExample
    def listExample
    def mapExample
    def heading
    def headingColor

    @Override
    public void activate() throws Exception {
        def props = getProperties();

        stringExample = 'I am groovy!! I am trust me for real.';

        listExample = ['one', 'two', 'three']

        mapExample = ['one': 1, 'two' : 2, 'three' : 3]

        try {
            heading = props.get(HEADING_PROP_NAME, '')
            headingColor = props.get(HEADING_COLOR_PROP_NAME, '') == '' ?
                    '' : CSS_CLASS_NAME_MAP[props.get(HEADING_COLOR_PROP_NAME, '')]

        } finally {

        }
    }

}
