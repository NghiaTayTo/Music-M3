package NgheGiHomNay;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Top100 extends javax.swing.JPanel {

    private static JLabel selectedLabel = null;

    public Top100() {
        initComponents();
        init();
    }

    public void init() {
        hover(lbVietNam);
        hover(lbAuMy);
        hover(lbChauA);
        hover(lbKhongLoi);
    }

    public void hover(JLabel label) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Di chuột vào, thêm border bên dưới
                label.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(29, 194, 241)));
                setHandCursor(label);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Di chuột ra, chỉ thay đổi border nếu label này không phải là label được chọn
                if (label != selectedLabel) {
                    label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                    setDefaultCursor(label);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Nếu có một label khác được chọn, loại bỏ border của nó
                if (selectedLabel != null) {
                    selectedLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                }

                // Thiết lập border cho label được chọn
                label.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(29, 194, 241)));

                // Cập nhật label được chọn
                selectedLabel = label;
            }
        });
    }

    private static void setHandCursor(Component component) {
        Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
        component.setCursor(handCursor);
    }

    // Đặt hình mặc định cho chuột
    private static void setDefaultCursor(Component component) {
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        component.setCursor(defaultCursor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVietNam = new javax.swing.JLabel();
        lbAuMy = new javax.swing.JLabel();
        lbChauA = new javax.swing.JLabel();
        lbKhongLoi = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(29, 38, 49));

        lbVietNam.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbVietNam.setForeground(new java.awt.Color(255, 255, 255));
        lbVietNam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVietNam.setText("Việt nam");

        lbAuMy.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbAuMy.setForeground(new java.awt.Color(255, 255, 255));
        lbAuMy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAuMy.setText("Âu Mỹ");

        lbChauA.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbChauA.setForeground(new java.awt.Color(255, 255, 255));
        lbChauA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChauA.setText("Châu Á");

        lbKhongLoi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbKhongLoi.setForeground(new java.awt.Color(255, 255, 255));
        lbKhongLoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbKhongLoi.setText("Không Lời");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(lbVietNam, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAuMy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbChauA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbKhongLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVietNam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAuMy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChauA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbKhongLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAuMy;
    private javax.swing.JLabel lbChauA;
    private javax.swing.JLabel lbKhongLoi;
    private javax.swing.JLabel lbVietNam;
    // End of variables declaration//GEN-END:variables
}
