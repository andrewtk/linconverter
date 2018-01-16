/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import lorgNew.tables.QsToTopic;
import lorgNew.tables.records.QsToTopicRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QsToTopicDao extends DAOImpl<QsToTopicRecord, lorgNew.tables.pojos.QsToTopic, Integer> {

    /**
     * Create a new QsToTopicDao without any configuration
     */
    public QsToTopicDao() {
        super(QsToTopic.QS_TO_TOPIC, lorgNew.tables.pojos.QsToTopic.class);
    }

    /**
     * Create a new QsToTopicDao with an attached configuration
     */
    public QsToTopicDao(Configuration configuration) {
        super(QsToTopic.QS_TO_TOPIC, lorgNew.tables.pojos.QsToTopic.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(lorgNew.tables.pojos.QsToTopic object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<lorgNew.tables.pojos.QsToTopic> fetchById(Integer... values) {
        return fetch(QsToTopic.QS_TO_TOPIC.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public lorgNew.tables.pojos.QsToTopic fetchOneById(Integer value) {
        return fetchOne(QsToTopic.QS_TO_TOPIC.ID, value);
    }

    /**
     * Fetch records that have <code>tpid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.QsToTopic> fetchByTpid(Integer... values) {
        return fetch(QsToTopic.QS_TO_TOPIC.TPID, values);
    }

    /**
     * Fetch records that have <code>qsid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.QsToTopic> fetchByQsid(Integer... values) {
        return fetch(QsToTopic.QS_TO_TOPIC.QSID, values);
    }
}